package org.sang.service.impl;

import org.sang.dao.SysRoleDao;
import org.sang.entity.SysRole;
import org.sang.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色信息(SysRole)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 22:02:24
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleDao sysRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysRole queryById(Integer id) {
        return this.sysRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRole> queryAllByLimit(int offset, int limit) {
        return this.sysRoleDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<SysRole> queryAll(SysRole sysRole) {
        return sysRoleDao.queryAll(sysRole);
    }

    /**
     * 新增数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(SysRole sysRole) {
       return this.sysRoleDao.insert(sysRole);
    }

    /**
     * 修改数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysRole update(SysRole sysRole) {
        this.sysRoleDao.update(sysRole);
        return this.queryById(sysRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysRoleDao.deleteById(id) > 0;
    }
}